  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: s0
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s1]], _ v2: s3, _ v3: s0, _ v4: s2, _ v5: [s3], _ v6: s2, _ v7: Double) -> Double {
    let v20: [s1] = v1[0]
    var v25: Double = v7
    let v18: s1 = v20[0]
    let v22: s0 = v18.p0
    let v30: [[Double]] = v22.p0
    var v61: [[Double]] = v30
    var v43: Double = v7
    var v28: [[Double]] = v61
    let v29: Double = v25 / v43
    let v137: Double = v29 * v43
    let v77: [Double] = v28[1]
    let v128: Double = v77[0]
    let v246: Double = v128 - v29
    v43 = v246
    return v137
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: [[s1]] = [[s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p1: [[s0(p0: [[6.0], [7.0]], p1: [[8.0]])]])], [s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]])]])], [s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: [[s0(p0: [[18.0], [19.0]], p1: [[20.0]])]])]]
    let v2: s3 = s3(p0: s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: [[s0(p0: [[24.0], [25.0]], p1: [[26.0]])]]), p1: s1(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: [[s0(p0: [[30.0], [31.0]], p1: [[32.0]])]]))
    let v3: s0 = s0(p0: [[33.0], [34.0]], p1: [[35.0]])
    let v4: s2 = s2(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])], p1: s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: [[s0(p0: [[45.0], [46.0]], p1: [[47.0]])]]), p2: s0(p0: [[48.0], [49.0]], p1: [[50.0]]))
    let v5: [s3] = [s3(p0: s1(p0: s0(p0: [[51.0], [52.0]], p1: [[53.0]]), p1: [[s0(p0: [[54.0], [55.0]], p1: [[56.0]])]]), p1: s1(p0: s0(p0: [[57.0], [58.0]], p1: [[59.0]]), p1: [[s0(p0: [[60.0], [61.0]], p1: [[62.0]])]]))]
    let v6: s2 = s2(p0: [s0(p0: [[63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0]], p1: [[68.0]])], p1: s1(p0: s0(p0: [[69.0], [70.0]], p1: [[71.0]]), p1: [[s0(p0: [[72.0], [73.0]], p1: [[74.0]])]]), p2: s0(p0: [[75.0], [76.0]], p1: [[77.0]]))
    let v7: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
