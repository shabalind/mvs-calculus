  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    let v8: [[s1]] = v0.p1
    var v4: [[s1]] = v8
    let v7: [s1] = v4[1]
    v4[0] = v7
    let v5: s1 = v7[0]
    let v21: s0 = v5.p2
    v4[0] = v7
    v4[1] = v7
    let v13: [[Double]] = v21.p2
    let v42: [Double] = v13[0]
    v4 = v8
    let v30: Double = v42[0]
    let v66: Double = v30 + v30
    let v47: Double = v30 * v66
    var v118: Double = v47
    return v118
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0], [7.0]]), p1: [[s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0], [15.0]]), p1: [[s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0], [21.0]], p2: [[22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]], p2: [[30.0], [31.0]])]], p2: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0], [36.0], [37.0]], p2: [[38.0], [39.0]]))], [s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0], [45.0]], p2: [[46.0], [47.0]]), p1: [[s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]], p2: [[54.0], [55.0]])], [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0], [61.0]], p2: [[62.0], [63.0]])]], p2: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0], [68.0], [69.0]], p2: [[70.0], [71.0]]))]])
    let v1: s0 = s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]], p2: [[78.0], [79.0]])
    let v2: s0 = s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0], [85.0]], p2: [[86.0], [87.0]])
    let v3: Double = 88.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 88.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
