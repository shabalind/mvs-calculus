  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: [s0] = v0.p1
    let v10: s0 = v2[1]
    let v6: s0 = v2[0]
    var v17: s0 = v6
    let v13: [[Double]] = v10.p1
    v17.p1 = v13
    let v73: [[Double]] = v17.p0
    let v24: [Double] = v73[0]
    v17.p0 = v73
    let v33: Double = v24[0]
    return v33
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
