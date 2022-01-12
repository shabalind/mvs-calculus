  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s8 {
    var p0: s1
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s8]], _ v2: Double) -> Double {
    let v4: s1 = v0.p1
    let v9: s0 = v4.p1
    let v13: [[Double]] = v9.p2
    let v14: [[Double]] = v9.p1
    let v21: [Double] = v13[0]
    let v22: [Double] = v14[1]
    let v41: Double = v21[0]
    let v69: [Double] = v14[0]
    let v90: Double = v22[0]
    let v46: Double = v2 / v90
    let v86: Double = v69[0]
    let v267: Double = v41 / v46
    let v211: Double = v86 * v267
    return v211
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0]]), p1: s0(p0: [[6.0], [7.0]], p1: [[8.0], [9.0], [10.0]], p2: [[11.0]])), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0], [16.0]], p2: [[17.0]])), p1: s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0], [22.0]], p2: [[23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0], [28.0]], p2: [[29.0]])))
    let v1: [[s8]] = [[s8(p0: s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]], p2: [[35.0]]), p1: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0], [40.0]], p2: [[41.0]])), p1: s3(p0: s2(p0: s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0], [45.0], [46.0]], p2: [[47.0]]), p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0], [52.0]], p2: [[53.0]])), p1: s0(p0: [[54.0], [55.0]], p1: [[56.0], [57.0], [58.0]], p2: [[59.0]])), p1: s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]], p2: [[65.0]]), p1: s0(p0: [[66.0], [67.0]], p1: [[68.0], [69.0], [70.0]], p2: [[71.0]]))))]]
    let v2: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
