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
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  struct s7 {
    var p0: [s2]
    var p1: s0
  }
  struct s8 {
    var p0: s1
    var p1: s7
  }
  func f83(_ v0: Double) -> Double {
    var v4: Double = v0
    var v6: Double = v4
    v6 = v4
    var v7: Double = v6
    let v1: [Double] = [v4, v7, v4]
    var v11: [Double] = v1
    v11[2] = v6
    v11[1] = v7
    let v5: Double = v11[0]
    let v10: Double = v1[2]
    let v17: Double = v1[1]
    let v12: Double = v11[0]
    v11[1] = v5
    let v9: Double = v1[0]
    let v21: [[Double]] = [v1, v1, v1, v1, v11]
    v11[2] = v12
    var v35: [[Double]] = v21
    v11[2] = v17
    let v31: [Double] = v35[3]
    var v18: [Double] = v31
    var v14: [Double] = v18
    v18[0] = v9
    v35[3] = v31
    var v37: [Double] = v14
    v37[1] = v10
    let v34: Double = v37[2]
    return v34
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: [[s4]], _ v2: Double) -> Double {
    let v12: Double = f83(v2)
    var v33: Double = v12
    return v33
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), p1: s7(p0: [s2(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]])), s2(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]])), s2(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]]))], p1: s0(p0: [[30.0], [31.0]], p1: [[32.0]])))]
    let v1: [[s4]] = [[s4(p0: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])], p1: s2(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]])))], [s4(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]]), s0(p0: [[54.0], [55.0]], p1: [[56.0]])], p1: s2(p0: s0(p0: [[57.0], [58.0]], p1: [[59.0]]), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0]])))], [s4(p0: [s0(p0: [[63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0]], p1: [[68.0]]), s0(p0: [[69.0], [70.0]], p1: [[71.0]])], p1: s2(p0: s0(p0: [[72.0], [73.0]], p1: [[74.0]]), p1: s0(p0: [[75.0], [76.0]], p1: [[77.0]])))]]
    let v2: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
