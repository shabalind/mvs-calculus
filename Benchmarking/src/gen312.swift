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
    var p0: [[s1]]
    var p1: [[s0]]
  }
  func f35(_ v0: Double) -> Double {
    var v6: Double = v0
    var v4: Double = v6
    v6 = v4
    var v2: Double = v6
    var v5: Double = v2
    var v7: Double = v5
    var v1: Double = v2
    v1 = v0
    var v16: Double = v1
    var v10: Double = v7
    var v9: Double = v1
    var v15: Double = v9
    var v30: Double = v6
    var v18: Double = v5
    var v35: Double = v18
    let v14: [Double] = [v10, v2, v30, v16, v35, v0, v5]
    var v25: [Double] = v14
    var v20: [Double] = v25
    var v24: [Double] = v25
    let v39: Double = v14[6]
    v24[6] = v30
    let v27: Double = v24[0]
    v20[4] = v27
    var v122: [Double] = v25
    v122[2] = v27
    var v52: Double = v7
    let v58: [[Double]] = [v25, v14, v20, v122]
    let v118: [Double] = v58[3]
    v122[4] = v39
    var v85: Double = v2
    let v67: [[Double]] = [v118, v20]
    v20[0] = v15
    v122[6] = v1
    v30 = v52
    let v172: [Double] = v67[1]
    v24[0] = v18
    v1 = v85
    let v114: Double = v172[1]
    v122[2] = v1
    v122[1] = v1
    return v114
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [[s0]], _ v2: [s0], _ v3: s2, _ v4: Double) -> Double {
    let v9: Double = f35(v4)
    var v28: Double = v4
    let v27: Double = v28 * v9
    return v27
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]))], [s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]]))], [s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]]))]], p1: [[s0(p0: [[12.0]], p1: [[13.0]])], [s0(p0: [[14.0]], p1: [[15.0]])], [s0(p0: [[16.0]], p1: [[17.0]])]]), s2(p0: [[s1(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]]))], [s1(p0: s0(p0: [[22.0]], p1: [[23.0]]), p1: s0(p0: [[24.0]], p1: [[25.0]]))], [s1(p0: s0(p0: [[26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0]]))]], p1: [[s0(p0: [[30.0]], p1: [[31.0]])], [s0(p0: [[32.0]], p1: [[33.0]])], [s0(p0: [[34.0]], p1: [[35.0]])]]), s2(p0: [[s1(p0: s0(p0: [[36.0]], p1: [[37.0]]), p1: s0(p0: [[38.0]], p1: [[39.0]]))], [s1(p0: s0(p0: [[40.0]], p1: [[41.0]]), p1: s0(p0: [[42.0]], p1: [[43.0]]))], [s1(p0: s0(p0: [[44.0]], p1: [[45.0]]), p1: s0(p0: [[46.0]], p1: [[47.0]]))]], p1: [[s0(p0: [[48.0]], p1: [[49.0]])], [s0(p0: [[50.0]], p1: [[51.0]])], [s0(p0: [[52.0]], p1: [[53.0]])]])]
    let v1: [[s0]] = [[s0(p0: [[54.0]], p1: [[55.0]])]]
    let v2: [s0] = [s0(p0: [[56.0]], p1: [[57.0]]), s0(p0: [[58.0]], p1: [[59.0]])]
    let v3: s2 = s2(p0: [[s1(p0: s0(p0: [[60.0]], p1: [[61.0]]), p1: s0(p0: [[62.0]], p1: [[63.0]]))], [s1(p0: s0(p0: [[64.0]], p1: [[65.0]]), p1: s0(p0: [[66.0]], p1: [[67.0]]))], [s1(p0: s0(p0: [[68.0]], p1: [[69.0]]), p1: s0(p0: [[70.0]], p1: [[71.0]]))]], p1: [[s0(p0: [[72.0]], p1: [[73.0]])], [s0(p0: [[74.0]], p1: [[75.0]])], [s0(p0: [[76.0]], p1: [[77.0]])]])
    let v4: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
