  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s2], _ v2: Double) -> Double {
    let v6: s2 = v1[0]
    let v10: s0 = v6.p0
    let v20: [[Double]] = v10.p1
    let v19: [Double] = v20[0]
    let v23: Double = v19[0]
    let v33: [Double] = v20[0]
    let v39: Double = v23 + v23
    let v44: Double = v33[0]
    let v46: Double = v39 - v44
    let v77: Double = v46 - v2
    return v77
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), s2(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])), s2(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]))
    let v1: [s2] = [s2(p0: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])), s2(p0: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), p1: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]))]
    let v2: Double = 55.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 55.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
