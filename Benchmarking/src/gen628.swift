  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s5 {
    var p0: [[s1]]
    var p1: s4
  }
  func f51(_ v0: [s1]) -> [s1] {
    return v0
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v7: Double = v1 + v1
    let v6: s4 = v0.p1
    let v3: [s1] = v6.p0
    let v4: [[s1]] = v0.p0
    let v2: [s1] = f51(v3)
    var v10: [[s1]] = v4
    var v9: [s1] = v2
    v10[0] = v2
    let v19: [s1] = v6.p0
    v10[1] = v19
    v10 = v4
    var v18: Double = v7
    v10[1] = v2
    let v14: [s1] = v4[0]
    let v15: s1 = v9[0]
    let v27: [s0] = v15.p1
    var v16: s1 = v15
    v10[0] = v14
    let v42: s0 = v27[1]
    let v24: s1 = v19[0]
    v16.p0 = v27
    let v25: [s0] = v15.p0
    let v63: [[Double]] = v42.p0
    let v51: [Double] = v63[0]
    v9[0] = v24
    var v48: s1 = v16
    v9[0] = v16
    let v114: Double = v51[0]
    v10[1] = v2
    v48.p1 = v27
    let v91: Double = v18 - v1
    v48.p1 = v27
    v16.p1 = v27
    var v105: s1 = v16
    v9[0] = v48
    let v79: [s1] = v10[0]
    v9[0] = v105
    let v73: Double = v114 / v91
    let v173: s1 = v79[0]
    v9[0] = v173
    v105.p1 = v25
    return v73
  }
  func benchmark() {
    let v0: s5 = s5(p0: [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])], [s1(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])], p1: [s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])])]], p1: s4(p0: [s1(p0: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]), s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]]), s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]])], p1: [s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]]), s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])])], p1: [[s0(p0: [[90.0], [91.0]], p1: [[92.0], [93.0], [94.0]])]]))
    let v1: Double = 95.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 95.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
