  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v3: s0 = v0.p1
    let v7: [[Double]] = v3.p0
    let v2: [[Double]] = v3.p1
    let v13: [Double] = v2[0]
    let v16: [Double] = v7[0]
    let v48: Double = v13[0]
    let v35: Double = v16[0]
    var v25: Double = v35
    let v31: Double = v48 / v25
    let v103: Double = v31 - v35
    return v103
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]]))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
