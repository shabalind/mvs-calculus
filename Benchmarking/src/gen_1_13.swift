  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: [[s0]]
  }
  func f74(_ v0: s0, _ v1: s0) -> s0 {
    let v7: [[Double]] = v1.p1
    let v2: Double = v0.p0
    var v4: s0 = v1
    var v3: Double = v2
    let v8: s0 = s0(p0: v3, p1: v7)
    let v14: Double = v8.p0
    var v11: s0 = v1
    v11.p1 = v7
    v11.p1 = v7
    v4 = v11
    var v13: Double = v14
    v4.p0 = v13
    v4.p1 = v7
    return v4
  }
  func f70(_ v0: s0, _ v1: s0) -> s0 {
    let v7: s0 = f74(v0, v1)
    let v5: s0 = f74(v0, v0)
    let v4: s0 = f74(v0, v7)
    let v2: s0 = f74(v1, v5)
    let v9: s0 = f74(v7, v1)
    let v13: s0 = f74(v9, v2)
    let v18: s0 = f74(v13, v4)
    return v18
  }
  func f67(_ v0: s0) -> s0 {
    let v1: s0 = f70(v0, v0)
    let v6: s0 = f70(v0, v1)
    let v18: s0 = f74(v6, v6)
    let v10: s0 = f70(v18, v6)
    return v10
  }
  func f50(_ v0: s0, _ v1: s0) -> s0 {
    let v2: s0 = f70(v0, v1)
    return v2
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: [s1], _ v3: Double) -> Double {
    let v8: [[s0]] = v1.p0
    let v9: [s0] = v8[1]
    let v48: s0 = v9[0]
    let v57: s0 = f50(v48, v48)
    let v76: s0 = f67(v57)
    let v118: Double = v76.p0
    return v118
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: 0.0, p1: [[1.0], [2.0], [3.0]]), s0(p0: 4.0, p1: [[5.0], [6.0], [7.0]])]
    let v1: s1 = s1(p0: [[s0(p0: 8.0, p1: [[9.0], [10.0], [11.0]])], [s0(p0: 12.0, p1: [[13.0], [14.0], [15.0]])]], p1: s0(p0: 16.0, p1: [[17.0], [18.0], [19.0]]), p2: [[s0(p0: 20.0, p1: [[21.0], [22.0], [23.0]])]])
    let v2: [s1] = [s1(p0: [[s0(p0: 24.0, p1: [[25.0], [26.0], [27.0]])], [s0(p0: 28.0, p1: [[29.0], [30.0], [31.0]])]], p1: s0(p0: 32.0, p1: [[33.0], [34.0], [35.0]]), p2: [[s0(p0: 36.0, p1: [[37.0], [38.0], [39.0]])]]), s1(p0: [[s0(p0: 40.0, p1: [[41.0], [42.0], [43.0]])], [s0(p0: 44.0, p1: [[45.0], [46.0], [47.0]])]], p1: s0(p0: 48.0, p1: [[49.0], [50.0], [51.0]]), p2: [[s0(p0: 52.0, p1: [[53.0], [54.0], [55.0]])]]), s1(p0: [[s0(p0: 56.0, p1: [[57.0], [58.0], [59.0]])], [s0(p0: 60.0, p1: [[61.0], [62.0], [63.0]])]], p1: s0(p0: 64.0, p1: [[65.0], [66.0], [67.0]]), p2: [[s0(p0: 68.0, p1: [[69.0], [70.0], [71.0]])]])]
    let v3: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
