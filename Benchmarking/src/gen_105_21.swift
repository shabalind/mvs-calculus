  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  func f28(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v3
    var v6: Double = v0
    var v2: Double = v5
    var v4: Double = v2
    var v12: Double = v6
    var v1: Double = v3
    var v23: Double = v6
    v1 = v6
    var v9: Double = v0
    v1 = v12
    let v8: [Double] = [v23, v4, v5, v5, v9, v0, v1]
    let v43: Double = v8[1]
    return v43
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: Double = f28(v1)
    var v15: Double = v2
    return v15
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]]), p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]))
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
