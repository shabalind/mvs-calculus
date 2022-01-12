  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: Double) -> Double {
    let v10: [[Double]] = v1.p0
    var v13: [[Double]] = v10
    let v6: [Double] = v10[0]
    var v30: [[Double]] = v10
    v13[0] = v6
    let v12: [Double] = v10[0]
    v30[0] = v12
    let v17: [Double] = v13[0]
    v13[0] = v17
    v13[0] = v17
    let v38: [Double] = v30[0]
    v30[0] = v6
    let v53: Double = v38[0]
    v30[0] = v17
    return v53
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))]
    let v1: s0 = s0(p0: [[12.0]], p1: [[13.0], [14.0]])
    let v2: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
