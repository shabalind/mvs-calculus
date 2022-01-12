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
    var p0: [[s0]]
    var p1: [s1]
  }
  func f35(_ v0: [s1], _ v1: s2) -> [s1] {
    var v8: s2 = v1
    let v13: [[s0]] = v8.p0
    v8.p0 = v13
    v8.p0 = v13
    v8.p0 = v13
    let v18: [[s0]] = v1.p0
    let v42: [[s0]] = v8.p0
    v8.p0 = v18
    var v26: s2 = v1
    var v69: s2 = v1
    v26.p0 = v42
    let v67: [s1] = v26.p1
    v69.p0 = v18
    v69.p1 = v0
    v26.p1 = v0
    v69.p1 = v67
    let v152: s1 = v67[0]
    let v114: [[s0]] = v8.p0
    let v59: [[s0]] = v26.p0
    let v68: [[s0]] = v69.p0
    var v53: [s1] = v0
    v8.p0 = v18
    var v70: s2 = v8
    v69.p1 = v67
    var v104: s2 = v70
    v69.p0 = v18
    v104.p0 = v68
    var v164: [s1] = v0
    v69.p0 = v13
    v69.p1 = v164
    let v151: [s1] = v104.p1
    v8.p0 = v18
    v8.p0 = v59
    v164[1] = v152
    v70.p0 = v42
    v69.p0 = v114
    v26.p1 = v53
    return v151
  }
  func f28(_ v0: s2) -> s2 {
    let v7: [[s0]] = v0.p0
    var v6: s2 = v0
    let v1: [[s0]] = v6.p0
    var v2: s2 = v0
    var v21: [[s0]] = v7
    v2.p0 = v21
    let v22: [s1] = v6.p1
    v6.p0 = v1
    let v27: [[s0]] = v0.p0
    var v43: s2 = v6
    v2.p1 = v22
    let v35: [s1] = f35(v22, v0)
    let v73: [s1] = v43.p1
    v6.p0 = v1
    let v81: [[s0]] = v2.p0
    v43.p1 = v35
    v6.p0 = v81
    let v125: s2 = s2(p0: v7, p1: v73)
    v43.p1 = v73
    v2.p0 = v27
    return v125
  }
  func f19(_ v0: s2) -> s2 {
    let v8: s2 = f28(v0)
    let v3: [[s0]] = v8.p0
    var v6: [[s0]] = v3
    let v14: [s1] = v0.p1
    let v22: s2 = s2(p0: v6, p1: v14)
    return v22
  }
  func f15(_ v0: s1) -> s1 {
    var v8: s1 = v0
    return v8
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v2: s2 = v0[0]
    let v3: s2 = f19(v2)
    let v4: s2 = f19(v3)
    let v19: [s1] = v4.p1
    let v42: s1 = v19[2]
    let v29: s1 = f15(v42)
    let v39: s0 = v29.p1
    let v91: [[Double]] = v39.p0
    let v46: [Double] = v91[0]
    var v45: Double = v1
    let v219: Double = v46[0]
    let v200: Double = v219 - v45
    return v200
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]], p1: [s1(p0: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])), s1(p0: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]], p1: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])), s1(p0: [[s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]], p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))])]
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
