  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: [[s2]]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: [s2] = v0.p0
    let v5: [s2] = v0.p0
    let v8: s2 = v2[0]
    let v4: [s1] = v8.p0
    let v9: s2 = v5[0]
    let v12: s0 = v9.p1
    let v16: s1 = v4[0]
    let v21: [s0] = v16.p0
    let v17: [s0] = [v12, v12, v12, v12]
    let v30: s0 = v21[0]
    var v19: [s0] = v21
    let v43: s0 = v19[0]
    let v85: [[Double]] = v43.p0
    v19[1] = v30
    let v81: [Double] = v85[0]
    let v41: [s0] = v16.p0
    v19[0] = v30
    let v69: s0 = v41[1]
    let v75: s0 = v17[2]
    v19[0] = v69
    v19[0] = v75
    let v106: Double = v81[0]
    return v106
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])], p1: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])])], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]])), s2(p0: [s1(p0: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p1: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])]), s1(p0: [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])], p1: [s0(p0: [[45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0]])])], p1: s0(p0: [[51.0], [52.0]], p1: [[53.0]]))], p1: [[s2(p0: [s1(p0: [s0(p0: [[54.0], [55.0]], p1: [[56.0]]), s0(p0: [[57.0], [58.0]], p1: [[59.0]])], p1: [s0(p0: [[60.0], [61.0]], p1: [[62.0]]), s0(p0: [[63.0], [64.0]], p1: [[65.0]])]), s1(p0: [s0(p0: [[66.0], [67.0]], p1: [[68.0]]), s0(p0: [[69.0], [70.0]], p1: [[71.0]])], p1: [s0(p0: [[72.0], [73.0]], p1: [[74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0]])])], p1: s0(p0: [[78.0], [79.0]], p1: [[80.0]]))]])
    let v1: Double = 81.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 81.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
