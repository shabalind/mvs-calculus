  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    var v7: Double = v1
    let v4: s3 = v0[2]
    let v3: s1 = v4.p0
    var v13: s1 = v3
    let v9: s0 = v13.p0
    v13.p0 = v9
    var v28: s0 = v9
    var v14: s0 = v28
    let v15: [[Double]] = v14.p1
    let v18: [Double] = v15[2]
    let v19: Double = v18[0]
    v14.p1 = v15
    let v21: [[Double]] = v14.p0
    let v59: s0 = s0(p0: v21, p1: v15)
    v13.p0 = v59
    let v27: Double = v7 + v19
    return v27
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), p1: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]), s3(p0: s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])), p1: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]), s3(p0: s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])), p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])])]
    let v1: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
