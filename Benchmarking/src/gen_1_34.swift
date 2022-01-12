  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: [s0], _ v3: s0, _ v4: [s0], _ v5: [s0], _ v6: [[s0]], _ v7: Double) -> Double {
    let v20: [s0] = v6[1]
    let v28: [[Double]] = v3.p1
    let v19: [Double] = v28[0]
    let v25: s0 = v20[0]
    let v37: [[Double]] = v25.p0
    let v33: Double = v19[0]
    let v23: Double = v33 / v33
    let v178: [Double] = v37[1]
    let v103: Double = v178[0]
    let v46: Double = v103 + v23
    return v46
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]
    let v1: s0 = s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])
    let v2: [s0] = [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]
    let v3: s0 = s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])
    let v4: [s0] = [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])]
    let v5: [s0] = [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])]
    let v6: [[s0]] = [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])], [s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])], [s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])]]
    let v7: Double = 55.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 55.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
