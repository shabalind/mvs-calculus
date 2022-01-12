  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: s0, _ v4: [s0], _ v5: Double) -> Double {
    let v28: s0 = v4[2]
    let v9: [[Double]] = v28.p1
    var v13: [[Double]] = v9
    let v15: [Double] = v13[1]
    var v16: [Double] = v15
    var v59: [Double] = v16
    let v36: Double = v59[0]
    let v29: Double = v15[0]
    v16[0] = v36
    v59[0] = v5
    let v94: [[Double]] = v1.p1
    let v37: [[Double]] = v3.p1
    var v87: Double = v36
    var v39: Double = v87
    v59[0] = v29
    v13[0] = v16
    v13 = v94
    v13 = v37
    return v39
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: s0 = s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])
    let v2: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])
    let v3: s0 = s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])
    let v4: [s0] = [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])]
    let v5: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
