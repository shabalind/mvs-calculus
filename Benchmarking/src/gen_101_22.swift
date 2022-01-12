  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: [s1]
  }
  func f94(_ v0: s1) -> s1 {
    let v6: s0 = v0.p1
    var v5: s0 = v6
    let v2: s3 = s3(p0: v0, p1: v5)
    let v24: s1 = v2.p0
    return v24
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v2: s1 = v0.p0
    let v4: s1 = f94(v2)
    let v5: s1 = f94(v4)
    let v3: [s0] = v5.p0
    let v22: s0 = v3[0]
    let v42: [[Double]] = v22.p1
    let v122: [Double] = v42[0]
    let v90: Double = v122[0]
    return v90
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: [s0(p0: 0.0, p1: [[1.0]])], p1: s0(p0: 2.0, p1: [[3.0]])), p1: [s1(p0: [s0(p0: 4.0, p1: [[5.0]])], p1: s0(p0: 6.0, p1: [[7.0]]))])
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
