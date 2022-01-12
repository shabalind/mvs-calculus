  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [[s0]], _ v2: [[s0]], _ v3: Double) -> Double {
    let v6: [s0] = v2[1]
    let v11: s0 = v6[0]
    let v18: [[Double]] = v11.p0
    let v13: [Double] = v18[1]
    let v14: [Double] = v18[0]
    var v12: [[Double]] = v18
    v12[2] = v14
    let v21: s0 = s0(p0: v12, p1: v12)
    let v16: [[Double]] = v21.p0
    v12[0] = v13
    let v44: [Double] = v16[1]
    let v61: Double = v44[0]
    return v61
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])), s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))]
    let v1: [[s0]] = [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])]]
    let v2: [[s0]] = [[s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])], [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])]]
    let v3: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
