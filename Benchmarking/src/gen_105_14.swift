  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: Double
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    var v8: [[s2]] = v0
    var v4: Double = v1
    var v5: [[s2]] = v0
    var v6: Double = v4
    let v2: [s2] = v0[0]
    v5[0] = v2
    v5[0] = v2
    let v3: [s2] = v0[0]
    let v9: [s2] = v8[0]
    let v10: s2 = v9[0]
    let v17: s1 = v10.p1
    let v12: s0 = v17.p1
    let v26: [[Double]] = v12.p1
    var v20: Double = v6
    v5[0] = v9
    let v21: s0 = v17.p0
    var v58: s0 = v12
    v58.p1 = v26
    let v65: [[Double]] = v21.p3
    let v36: [[Double]] = v58.p0
    let v45: [Double] = v36[0]
    var v63: [Double] = v45
    let v75: Double = v1 + v20
    var v54: [[s2]] = v5
    v5[0] = v3
    v58.p2 = v75
    let v39: [s2] = v54[0]
    v5[0] = v3
    v58.p2 = v20
    let v126: Double = v63[0]
    v8[0] = v39
    v58.p3 = v65
    v5 = v0
    return v126
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: 5.0, p3: [[6.0], [7.0], [8.0]], p4: [[9.0], [10.0], [11.0]])]], p1: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0]], p2: 17.0, p3: [[18.0], [19.0], [20.0]], p4: [[21.0], [22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0]], p2: 29.0, p3: [[30.0], [31.0], [32.0]], p4: [[33.0], [34.0], [35.0]])))]]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
