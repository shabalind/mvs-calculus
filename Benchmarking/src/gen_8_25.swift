  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [Double]
    var p2: s0
    var p3: s0
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v4: s1 = v0.p1
    let v14: s0 = v4.p0
    let v12: [[Double]] = v14.p1
    let v11: [Double] = v12[1]
    let v29: [[Double]] = [v11, v11, v11, v11, v11, v11, v11]
    let v81: [[[Double]]] = [v29, v29, v29, v29, v29, v29, v29]
    let v110: [[Double]] = v81[4]
    let v39: [Double] = v110[6]
    let v132: Double = v39[0]
    var v211: Double = v132
    return v211
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [5.0], p2: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]]), p3: s0(p0: [[11.0], [12.0], [13.0]], p1: [[14.0], [15.0]])), p1: s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0]]), p1: [21.0], p2: s0(p0: [[22.0], [23.0], [24.0]], p1: [[25.0], [26.0]]), p3: s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0], [31.0]])))
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
