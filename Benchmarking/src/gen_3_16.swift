  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s1
  }
  func f111(_ v0: Double) -> Double {
    var v3: Double = v0
    v3 = v0
    var v1: Double = v0
    var v7: Double = v1
    var v5: Double = v3
    var v4: Double = v5
    var v16: Double = v3
    var v9: Double = v16
    var v10: Double = v9
    var v8: Double = v1
    var v17: Double = v1
    var v41: Double = v5
    let v19: [Double] = [v9]
    let v27: Double = v19[0]
    var v35: [Double] = v19
    let v18: Double = v19[0]
    v35[0] = v18
    var v37: [Double] = v35
    v37[0] = v27
    v37[0] = v17
    var v32: [Double] = v35
    var v38: [Double] = v35
    let v29: Double = v32[0]
    let v66: [[Double]] = [v38, v35, v32, v37, v19, v32, v37]
    var v40: Double = v41
    v35[0] = v4
    v37[0] = v10
    v32[0] = v29
    let v34: Double = v32[0]
    let v54: [Double] = v66[6]
    v38[0] = v29
    v37[0] = v7
    v35[0] = v7
    v17 = v4
    v37[0] = v34
    v38[0] = v0
    v32[0] = v40
    let v52: Double = v54[0]
    v41 = v8
    return v52
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s2], _ v2: s1, _ v3: [s1], _ v4: Double) -> Double {
    let v7: Double = f111(v4)
    let v9: s0 = v2.p1
    let v19: [[Double]] = v9.p0
    let v32: [Double] = v19[0]
    let v46: Double = v32[0]
    var v26: [Double] = v32
    v26[0] = v46
    v26[0] = v7
    let v80: Double = v26[0]
    let v62: Double = f111(v46)
    let v194: Double = v62 + v80
    let v66: Double = v7 * v194
    let v141: Double = v66 / v46
    var v63: Double = v141
    return v63
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: s0(p0: [[3.0], [4.0], [5.0]]))]], p1: s1(p0: s0(p0: [[6.0], [7.0], [8.0]]), p1: s0(p0: [[9.0], [10.0], [11.0]])))]
    let v1: [s2] = [s2(p0: [[s1(p0: s0(p0: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]]))]], p1: s1(p0: s0(p0: [[18.0], [19.0], [20.0]]), p1: s0(p0: [[21.0], [22.0], [23.0]]))), s2(p0: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]]), p1: s0(p0: [[27.0], [28.0], [29.0]]))]], p1: s1(p0: s0(p0: [[30.0], [31.0], [32.0]]), p1: s0(p0: [[33.0], [34.0], [35.0]]))), s2(p0: [[s1(p0: s0(p0: [[36.0], [37.0], [38.0]]), p1: s0(p0: [[39.0], [40.0], [41.0]]))]], p1: s1(p0: s0(p0: [[42.0], [43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0], [47.0]])))]
    let v2: s1 = s1(p0: s0(p0: [[48.0], [49.0], [50.0]]), p1: s0(p0: [[51.0], [52.0], [53.0]]))
    let v3: [s1] = [s1(p0: s0(p0: [[54.0], [55.0], [56.0]]), p1: s0(p0: [[57.0], [58.0], [59.0]])), s1(p0: s0(p0: [[60.0], [61.0], [62.0]]), p1: s0(p0: [[63.0], [64.0], [65.0]]))]
    let v4: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
