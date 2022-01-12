  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: s0
  }
  struct s3 {
    var p0: s0
    var p1: s0
    var p2: s1
    var p3: s0
  }
  func f50(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v0
    var v2: Double = v6
    v3 = v0
    var v1: Double = v3
    var v11: Double = v1
    let v23: [Double] = [v0, v0, v11]
    let v21: [[Double]] = [v23, v23, v23, v23]
    var v80: [[Double]] = v21
    v80[1] = v23
    let v60: [Double] = v80[2]
    var v39: [Double] = v60
    v39[0] = v2
    let v37: Double = v39[2]
    return v37
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v3: Double = f50(v1)
    let v21: Double = v1 + v3
    let v47: [Double] = [v1, v3, v3, v21, v1]
    let v59: Double = v47[4]
    return v59
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]), p2: s1(p0: [s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])], p1: s0(p0: [[10.0]], p1: [[11.0]]), p2: s0(p0: [[12.0]], p1: [[13.0]])), p3: s0(p0: [[14.0]], p1: [[15.0]]))
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
