  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v2: s3 = v0
    var v5: Double = v1
    var v3: s3 = v2
    let v7: Double = v1 - v5
    var v11: Double = v5
    let v6: s0 = v3.p0
    var v21: Double = v11
    let v25: [[Double]] = v6.p1
    let v16: [Double] = v25[1]
    let v81: Double = v7 - v5
    var v62: [Double] = v16
    v11 = v5
    let v44: Double = v16[0]
    v5 = v7
    v62[0] = v21
    let v99: Double = v44 - v81
    v62[0] = v11
    var v114: Double = v99
    let v170: Double = v62[0]
    let v187: Double = v170 * v114
    return v187
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [[s1(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])])], [s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])])]])
    let v1: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
