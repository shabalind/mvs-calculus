  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [[s1]]
    var p1: [s0]
  }
  struct s8 {
    var p0: s0
    var p1: [s3]
  }
  func f21(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p1
    let v23: s0 = s0(p0: v7, p1: v2)
    return v23
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v4: s0 = v0.p0
    var v13: s0 = v4
    let v7: s0 = f21(v4)
    let v5: [[Double]] = v13.p1
    let v10: s0 = f21(v7)
    v13 = v10
    let v15: [[[Double]]] = [v5, v5, v5, v5]
    let v42: [[Double]] = v15[2]
    let v26: [[Double]] = v10.p0
    let v36: [Double] = v42[1]
    v13.p0 = v26
    var v19: [Double] = v36
    let v61: [[Double]] = v4.p0
    v13.p1 = v5
    v13.p0 = v61
    v13.p1 = v42
    let v158: Double = v19[0]
    return v158
  }
  func benchmark() {
    let v0: s8 = s8(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s3(p0: [[s1(p0: [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])]], p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]])]), s3(p0: [[s1(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]])], p1: [s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])])]], p1: [s0(p0: [[27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0]])])])
    let v1: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
