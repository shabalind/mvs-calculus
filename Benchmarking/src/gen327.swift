  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
    var p2: [[s0]]
  }
  struct s4 {
    var p0: s0
    var p1: [s0]
  }
  struct s9 {
    var p0: s4
    var p1: s1
  }
  func f28(_ v0: Double) -> Double {
    let v1: Double = v0 * v0
    var v2: Double = v1
    var v4: Double = v2
    var v19: Double = v4
    var v16: Double = v19
    return v16
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: s2, _ v2: [Double], _ v3: Double) -> Double {
    var v6: [Double] = v2
    let v5: [[Double]] = [v6]
    var v4: [[Double]] = v5
    let v20: Double = v2[0]
    let v15: [Double] = v4[0]
    v6[0] = v20
    let v14: Double = v6[0]
    var v18: [Double] = v15
    var v48: Double = v3
    v18[0] = v3
    let v36: Double = f28(v48)
    v6[0] = v36
    let v45: [Double] = v5[0]
    v4[0] = v45
    let v52: Double = v36 * v14
    v6[0] = v36
    let v27: Double = v2[0]
    let v164: Double = v3 / v20
    let v73: Double = f28(v20)
    v6 = v18
    let v99: Double = v27 + v36
    let v68: [Double] = [v73, v52, v14, v164, v14]
    v18[0] = v99
    let v65: Double = v68[3]
    return v65
  }
  func benchmark() {
    let v0: s9 = s9(p0: s4(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), p1: s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])]))
    let v1: s2 = s2(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p1: [[s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), p1: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])])], [s1(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])])]], p2: [[s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]])], [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])], [s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])]])
    let v2: [Double] = [84.0]
    let v3: Double = 85.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 85.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
