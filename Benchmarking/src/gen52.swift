  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  func f13(_ v0: s1) -> s1 {
    let v2: s0 = v0.p1
    var v4: s1 = v0
    var v3: s1 = v0
    v3.p1 = v2
    var v5: s1 = v4
    var v9: s1 = v5
    let v14: s0 = v0.p1
    let v17: s0 = v9.p1
    v3.p1 = v2
    v4.p1 = v17
    var v31: s1 = v4
    let v33: [[s0]] = v3.p0
    let v46: [[s0]] = v31.p0
    let v58: s1 = s1(p0: v46, p1: v14)
    let v65: [[s0]] = v4.p0
    let v63: [s0] = v33[0]
    var v50: s1 = v58
    v4.p0 = v65
    v50.p0 = v33
    let v115: s0 = v63[0]
    v3.p1 = v115
    return v50
  }
  func f2(_ v0: s2, _ v1: s0, _ v2: s0) -> s0 {
    let v6: [Double] = v1.p0
    let v10: [[Double]] = v1.p1
    var v7: s0 = v2
    v7.p1 = v10
    v7.p0 = v6
    let v15: s1 = v0.p0
    let v16: s1 = f13(v15)
    v7.p1 = v10
    let v25: [[Double]] = v7.p1
    let v30: s0 = v16.p1
    v7 = v30
    v7.p1 = v10
    v7.p1 = v25
    v7.p1 = v10
    return v7
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s1]], _ v2: Double) -> Double {
    let v4: [[s0]] = v0.p0
    var v9: s1 = v0
    let v5: [[s0]] = v0.p0
    v9.p0 = v4
    let v8: [s0] = v4[0]
    v9.p0 = v5
    let v7: s0 = v0.p1
    let v11: s2 = s2(p0: v9, p1: v8)
    let v3: s0 = f2(v11, v7, v7)
    let v18: s0 = f2(v11, v3, v3)
    v9.p0 = v5
    var v14: s2 = v11
    let v17: s0 = v9.p1
    var v36: s0 = v17
    let v31: s0 = f2(v14, v18, v36)
    let v39: [Double] = v31.p0
    let v29: Double = v39[0]
    v9.p1 = v18
    return v29
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [0.0], p1: [[1.0], [2.0], [3.0]])]], p1: s0(p0: [4.0], p1: [[5.0], [6.0], [7.0]]))
    let v1: [[s1]] = [[s1(p0: [[s0(p0: [8.0], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [12.0], p1: [[13.0], [14.0], [15.0]]))], [s1(p0: [[s0(p0: [16.0], p1: [[17.0], [18.0], [19.0]])]], p1: s0(p0: [20.0], p1: [[21.0], [22.0], [23.0]]))], [s1(p0: [[s0(p0: [24.0], p1: [[25.0], [26.0], [27.0]])]], p1: s0(p0: [28.0], p1: [[29.0], [30.0], [31.0]]))]]
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
