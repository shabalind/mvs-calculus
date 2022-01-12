  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: Double) -> Double {
    var v4: Double = v2
    var v3: Double = v4
    var v15: Double = v3
    let v7: Double = v3 + v15
    let v14: [Double] = [v15, v3]
    let v29: Double = v14[1]
    var v33: [Double] = v14
    let v20: [[Double]] = [v33, v14, v14]
    v33[0] = v7
    v33[1] = v29
    var v48: [[Double]] = v20
    let v42: [Double] = v20[1]
    v33 = v42
    let v56: [Double] = v48[2]
    v48[2] = v42
    var v144: [Double] = v56
    v48[1] = v144
    let v81: Double = v56[0]
    v48[0] = v33
    v144[0] = v7
    return v81
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])
    let v1: s1 = s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])])
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
