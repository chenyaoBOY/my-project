
package com.arithmethic.learn;
public class SnowflakeArithmethic{

    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        String timeStr = time+"";
//        System.out.println(timeStr.length()+"  "+timeStr);
        int i = 10;
        System.out.println(i<<10);
    }



}
//public class SnowflakeArithmethic implements IGenerator<Long>{
//
//        public static final int NODE_SHIFT = 10;
//        public static final int SEQ_SHIFT = 12;
//        public static final short MAX_NODE = 1024;
//        public static final short MAX_SEQUENCE = 4096;
//        private short sequence;
//        private long referenceTime;
//        private int node = -1;
//        private NodeGetter nodeGetter;
//
//        public Long generate(Class<?> modelClass) {
//            return this.next();
//        }
//
//        public void setNode(int node) {
//            if (node >= 0 && node <= 1024) {
//                this.node = node;
//            } else {
//                throw new IllegalArgumentException(String.format("node must be between %s and %s", 0, 1024));
//            }
//        }
//
//        public synchronized long next() {
//            long currentTime = System.currentTimeMillis();
//            if (currentTime < this.referenceTime) {
//                throw new RuntimeException(String.format("Last referenceTime %s is after reference time %s", this.referenceTime, currentTime));
//            } else {
//                if (currentTime > this.referenceTime) {
//                    this.sequence = 0;
//                } else {
//                    if (this.sequence >= 4096) {
//                        throw new RuntimeException("Sequence exhausted at " + this.sequence);
//                    }
//
//                    ++this.sequence;
//                }
//
//                long counter = (long) this.sequence;
//                this.referenceTime = currentTime;
//                return currentTime << 10 << 12 | (long) (this.getNode() << 12) | counter;
//            }
//        }
//
//        public void setNodeGetter(NodeGetter nodeGetter) {
//            this.nodeGetter = nodeGetter;
//        }
//
//        public int getNode() {
//            return this.nodeGetter != null ? this.nodeGetter.getNode() : this.node;
//        }
//    }
//}
