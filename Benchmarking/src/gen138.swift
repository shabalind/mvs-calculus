  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s6 {
    var p0: s0
    var p1: s2
  }
  func f70(_ v0: Double) -> Double {
    var v2: Double = v0
    var v5: Double = v2
    var v8: Double = v2
    var v1: Double = v5
    let v4: [Double] = [v1]
    var v11: [Double] = v4
    v11[0] = v8
    var v7: Double = v1
    v11[0] = v8
    let v14: Double = v4[0]
    let v29: Double = v11[0]
    v11[0] = v7
    var v40: Double = v29
    v11[0] = v14
    return v40
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: Double) -> Double {
    var v3: Double = v1
    var v81: Double = v3
    var v82: Double = v81
    var v48: Double = v82
    v81 = v48
    let v141: Double = f70(v81)
    return v141
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s2(p0: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]]))))], [s6(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: s2(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])], p1: s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))))]]
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
