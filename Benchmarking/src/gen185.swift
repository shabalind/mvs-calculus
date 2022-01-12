  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v3: [s0] = v0.p1
    var v2: [s0] = v3
    let v9: s0 = v2[0]
    let v12: [[Double]] = v9.p1
    v2[1] = v9
    let v19: s0 = v3[1]
    var v11: [[Double]] = v12
    let v15: [Double] = v11[0]
    let v14: Double = v15[0]
    v2[1] = v19
    v11[1] = v15
    return v14
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0], [4.0]], p3: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0]], p2: [[11.0], [12.0]], p3: [[13.0], [14.0], [15.0]])], p1: [s0(p0: [[16.0]], p1: [[17.0], [18.0]], p2: [[19.0], [20.0]], p3: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]], p2: [[27.0], [28.0]], p3: [[29.0], [30.0], [31.0]])])
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
