  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: [[s0]]
    var p3: [s0]
  }
  struct s2 {
    var p0: [[s1]]
    var p1: Double
  }
  func f69(_ v0: s2, _ v1: s2) -> s2 {
    var v33: s2 = v0
    return v33
  }
  func f63(_ v0: s2, _ v1: s2) -> s2 {
    let v4: s2 = f69(v0, v0)
    let v5: Double = v0.p1
    let v8: [[s1]] = v4.p0
    let v6: s2 = f69(v1, v1)
    let v9: [[s1]] = v1.p0
    let v12: s2 = f69(v4, v0)
    let v18: Double = v5 - v5
    let v22: s2 = f69(v0, v6)
    let v28: [[s1]] = v22.p0
    var v21: s2 = v6
    let v27: s2 = f69(v1, v1)
    v21.p0 = v8
    let v81: s2 = f69(v12, v27)
    v21.p0 = v28
    v21.p1 = v18
    let v62: [[s1]] = v4.p0
    v21.p0 = v28
    v21.p1 = v5
    let v74: s2 = f69(v81, v27)
    v21.p0 = v62
    let v67: s2 = f69(v74, v27)
    let v99: s2 = f69(v81, v21)
    v21.p0 = v9
    let v130: s2 = f69(v67, v99)
    return v130
  }
  func f53(_ v0: s2) -> s2 {
    let v3: [s2] = [v0, v0]
    let v10: s2 = v3[0]
    return v10
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v6: s2 = v0
    let v9: s2 = f53(v6)
    let v8: [[s1]] = v9.p0
    let v2: s2 = s2(p0: v8, p1: v1)
    v6.p1 = v1
    let v4: s2 = f63(v2, v0)
    let v13: s2 = f53(v4)
    var v42: s2 = v4
    var v22: s2 = v4
    let v38: s2 = f69(v0, v22)
    let v34: Double = v42.p1
    let v32: Double = v38.p1
    v6.p1 = v1
    v42.p1 = v34
    let v36: Double = v13.p1
    let v48: [Double] = [v1, v34, v36, v32, v32, v36]
    let v35: Double = v48[0]
    return v35
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]], p1: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], p2: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]], p3: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])])], [s1(p0: [[s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])]], p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])], p2: [[s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])]], p3: [s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])])]], p1: 60.0)
    let v1: Double = 61.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 61.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
