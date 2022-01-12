  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v7: s0 = v0.p0
    let v6: [s2] = [v0]
    let v10: s2 = v6[0]
    let v12: [[Double]] = v7.p2
    let v2: s0 = v10.p0
    let v17: [Double] = v12[2]
    let v13: [[Double]] = v2.p3
    var v43: [[Double]] = v13
    let v39: [Double] = v43[0]
    v43[0] = v17
    let v68: Double = v39[0]
    let v63: Double = v1 - v68
    return v63
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0], [6.0]], p3: [[7.0]], p4: [[8.0]]), p1: s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0]], p2: [[13.0], [14.0], [15.0]], p3: [[16.0]], p4: [[17.0]]))
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
