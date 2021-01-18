package ch02.sec06;

import java.util.ArrayList;

public class Network {
    public class Member { // Member is an inner class of Network
        private String name;
        private ArrayList<Member> friends = new ArrayList<>();

        public Member(String name) {
            this.name = name;
        }

        public void deactivate() {
            members.remove(this);
        }

        public void addFriend(Member newFriend) {
            friends.add(newFriend);
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }
        
        public String toString() {
            StringBuilder result = new StringBuilder(name);
            result.append(" with friends ");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }
    }

    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public String toString() {
        return members.toString();
    }
}