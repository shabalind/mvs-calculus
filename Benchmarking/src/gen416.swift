  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s5 {
    var p0: s1
    var p1: [s0]
  }
  struct s6 {
    var p0: s5
    var p1: [s1]
  }
  func f98(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v19: s0 = v7
    v7 = v0
    return v19
  }
  func f95(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v7: [s0] = [v0, v5, v5, v0]
    let v2: s0 = v7[0]
    let v6: s0 = v7[2]
    let v8: s0 = f98(v2)
    var v15: [s0] = v7
    let v13: [[Double]] = v2.p1
    let v10: s0 = v7[0]
    let v12: s0 = v7[3]
    let v14: [[Double]] = v2.p1
    let v9: [[Double]] = v6.p1
    v5.p0 = v13
    v15[2] = v8
    v5.p0 = v9
    var v25: [s0] = v7
    v25[3] = v6
    let v34: [[Double]] = v10.p1
    var v21: [[Double]] = v14
    let v30: [[Double]] = v10.p1
    let v11: s0 = v15[3]
    v5.p1 = v30
    let v26: s0 = f98(v12)
    v5.p0 = v21
    v25[3] = v8
    v5.p0 = v14
    let v37: s0 = f98(v26)
    v5 = v8
    let v29: [[Double]] = v37.p0
    let v55: [[Double]] = v11.p1
    v5.p1 = v29
    v5.p1 = v9
    v5.p0 = v30
    let v60: [[Double]] = v6.p0
    let v50: [[Double]] = v2.p1
    var v44: [[Double]] = v21
    v25[0] = v8
    v5.p0 = v44
    v5.p0 = v34
    v5.p1 = v60
    v5.p0 = v50
    let v135: [Double] = v55[1]
    let v61: s0 = v25[2]
    v44[0] = v135
    return v61
  }
  func f59(_ v0: s0) -> s0 {
    let v1: s0 = f98(v0)
    let v3: s0 = f98(v1)
    let v5: [[Double]] = v1.p1
    let v6: [[Double]] = v1.p0
    let v7: s0 = f95(v1)
    let v2: s0 = f95(v3)
    var v13: s0 = v7
    var v10: s0 = v13
    v13 = v2
    v10.p0 = v6
    v10.p1 = v6
    v13.p0 = v5
    let v18: [[Double]] = v7.p0
    v13.p0 = v6
    let v47: s0 = f95(v2)
    v10.p0 = v18
    let v88: [[Double]] = v47.p1
    let v48: s0 = f98(v10)
    v13.p0 = v88
    return v48
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v2: s6 = v0[0]
    let v10: [s1] = v2.p1
    let v26: s1 = v10[2]
    let v20: s0 = v26.p0
    let v18: s0 = f59(v20)
    let v79: [[Double]] = v18.p1
    let v146: [Double] = v79[1]
    var v105: [Double] = v146
    v105[0] = v1
    let v96: Double = v105[0]
    return v96
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s5(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [[s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]), p1: [s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: [[s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])], [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])]]), s1(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: [[s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])], [s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]])], [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])]]), s1(p0: s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]]), p1: [[s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])], [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]])], [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]])]])])]
    let v1: Double = 102.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 102.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
