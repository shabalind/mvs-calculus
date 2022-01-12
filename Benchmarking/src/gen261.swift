  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
  }
  func f85(_ v0: Double) -> Double {
    let v4: [Double] = [v0, v0]
    let v8: Double = v0 + v0
    let v2: Double = v4[1]
    var v5: Double = v2
    var v3: Double = v0
    var v1: [Double] = v4
    v1[1] = v5
    let v10: Double = v1[0]
    var v17: [Double] = v4
    let v18: Double = v17[1]
    let v9: Double = v2 - v0
    let v11: [Double] = [v2, v3, v8, v8]
    let v36: Double = v11[1]
    var v40: [Double] = v4
    let v28: Double = v11[1]
    var v15: [Double] = v17
    var v50: [Double] = v40
    let v27: [[Double]] = [v1, v1, v50, v15, v15, v50]
    let v43: [[[Double]]] = [v27, v27, v27]
    v40[0] = v5
    let v33: Double = v10 + v9
    var v26: [[[Double]]] = v43
    v1[0] = v9
    let v46: [[Double]] = v26[1]
    let v55: [[Double]] = v26[0]
    var v99: [[[Double]]] = v43
    var v65: [[Double]] = v55
    v50[0] = v9
    v99[0] = v46
    v3 = v36
    v26 = v99
    v15[1] = v33
    v50[1] = v9
    let v101: [Double] = v65[1]
    v50[1] = v18
    v40 = v4
    var v141: Double = v28
    v50[1] = v141
    let v256: Double = v101[1]
    v50[0] = v3
    return v256
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s3, _ v2: Double) -> Double {
    let v9: Double = v2 / v2
    let v19: Double = f85(v9)
    let v30: Double = f85(v19)
    return v30
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s1(p0: [s0(p0: [[0.0]], p1: [1.0], p2: [[2.0]]), s0(p0: [[3.0]], p1: [4.0], p2: [[5.0]]), s0(p0: [[6.0]], p1: [7.0], p2: [[8.0]])], p1: s0(p0: [[9.0]], p1: [10.0], p2: [[11.0]])), s1(p0: [s0(p0: [[12.0]], p1: [13.0], p2: [[14.0]]), s0(p0: [[15.0]], p1: [16.0], p2: [[17.0]]), s0(p0: [[18.0]], p1: [19.0], p2: [[20.0]])], p1: s0(p0: [[21.0]], p1: [22.0], p2: [[23.0]])), s1(p0: [s0(p0: [[24.0]], p1: [25.0], p2: [[26.0]]), s0(p0: [[27.0]], p1: [28.0], p2: [[29.0]]), s0(p0: [[30.0]], p1: [31.0], p2: [[32.0]])], p1: s0(p0: [[33.0]], p1: [34.0], p2: [[35.0]]))], p1: s0(p0: [[36.0]], p1: [37.0], p2: [[38.0]]))]
    let v1: s3 = s3(p0: [s1(p0: [s0(p0: [[39.0]], p1: [40.0], p2: [[41.0]]), s0(p0: [[42.0]], p1: [43.0], p2: [[44.0]]), s0(p0: [[45.0]], p1: [46.0], p2: [[47.0]])], p1: s0(p0: [[48.0]], p1: [49.0], p2: [[50.0]]))], p1: s2(p0: [s1(p0: [s0(p0: [[51.0]], p1: [52.0], p2: [[53.0]]), s0(p0: [[54.0]], p1: [55.0], p2: [[56.0]]), s0(p0: [[57.0]], p1: [58.0], p2: [[59.0]])], p1: s0(p0: [[60.0]], p1: [61.0], p2: [[62.0]])), s1(p0: [s0(p0: [[63.0]], p1: [64.0], p2: [[65.0]]), s0(p0: [[66.0]], p1: [67.0], p2: [[68.0]]), s0(p0: [[69.0]], p1: [70.0], p2: [[71.0]])], p1: s0(p0: [[72.0]], p1: [73.0], p2: [[74.0]])), s1(p0: [s0(p0: [[75.0]], p1: [76.0], p2: [[77.0]]), s0(p0: [[78.0]], p1: [79.0], p2: [[80.0]]), s0(p0: [[81.0]], p1: [82.0], p2: [[83.0]])], p1: s0(p0: [[84.0]], p1: [85.0], p2: [[86.0]]))], p1: s0(p0: [[87.0]], p1: [88.0], p2: [[89.0]])))
    let v2: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
