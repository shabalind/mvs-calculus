  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [[s1]]
    var p1: s1
  }
  func f46(_ v0: s1) -> s1 {
    return v0
  }
  func f25(_ v0: s2) -> s2 {
    let v7: [s2] = [v0, v0]
    let v2: s1 = v0.p0
    let v3: s1 = v0.p1
    let v4: s1 = f46(v3)
    let v17: s2 = v7[1]
    let v8: s2 = v7[1]
    var v14: [s2] = v7
    let v43: s2 = s2(p0: v2, p1: v4)
    v14[1] = v17
    v14[0] = v8
    v14[1] = v43
    let v46: s2 = v14[0]
    return v46
  }
  func f13(_ v0: s2) -> s2 {
    let v7: s2 = f25(v0)
    var v22: s2 = v7
    return v22
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: s2, _ v2: Double) -> Double {
    let v3: s2 = f13(v1)
    let v13: s1 = v3.p0
    let v8: s0 = v13.p1
    let v9: [[Double]] = v8.p1
    let v21: [[Double]] = v8.p0
    let v31: [Double] = v21[1]
    let v41: Double = v31[0]
    let v67: [Double] = v9[0]
    let v121: Double = v67[0]
    let v216: Double = v41 * v121
    return v216
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [[s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]))], [s1(p0: [[s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]))]], p1: s1(p0: [[s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])], [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])]], p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])))]
    let v1: s2 = s2(p0: s1(p0: [[s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])], [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])]], p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]])), p1: s1(p0: [[s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])], [s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])]], p1: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])))
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
