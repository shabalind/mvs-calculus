  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v7: [s3] = v0[0]
    let v3: s3 = v7[0]
    let v14: s1 = v3.p1
    var v41: s1 = v14
    let v68: s0 = v41.p1
    v41.p1 = v68
    v41 = v14
    var v54: s0 = v68
    var v48: s0 = v54
    let v77: [[Double]] = v48.p1
    v54 = v68
    let v69: [Double] = v77[0]
    let v78: Double = v69[0]
    return v78
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s1(p0: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])))], [s3(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: s1(p0: [[s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])]], p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])))], [s3(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: s1(p0: [[s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])], [s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])]], p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])))]]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
