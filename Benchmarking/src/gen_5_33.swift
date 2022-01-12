  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
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
    var p0: [[s2]]
    var p1: s2
  }
  struct s13 {
    var p0: [s3]
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s13, _ v1: Double) -> Double {
    let v4: s3 = v0.p1
    var v5: s3 = v4
    let v2: s2 = v5.p1
    let v20: s1 = v2.p0
    let v41: s0 = v20.p1
    let v28: [[Double]] = v41.p0
    var v22: [[Double]] = v28
    let v247: [Double] = v22[1]
    let v46: Double = v247[0]
    let v103: Double = v46 / v1
    return v103
  }
  func benchmark() {
    let v0: s13 = s13(p0: [s3(p0: [[s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])), p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))], [s2(p0: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]))], [s2(p0: s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])), p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]))]], p1: s2(p0: s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])), p1: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])))], p1: s3(p0: [[s2(p0: s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])), p1: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]))], [s2(p0: s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])), p1: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]))], [s2(p0: s1(p0: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), p1: s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])), p1: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]]))]], p1: s2(p0: s1(p0: s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]]), p1: s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])), p1: s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]]))))
    let v1: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
