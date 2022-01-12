  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v4: [Double] = [v1, v1, v1]
    var v5: [Double] = v4
    var v6: [Double] = v5
    var v9: [Double] = v4
    let v12: Double = v1 / v1
    v9[2] = v1
    v5 = v6
    var v13: [Double] = v4
    let v25: Double = v6[0]
    var v34: Double = v1
    let v22: Double = v5[0]
    v9 = v13
    var v35: [Double] = v6
    v35[1] = v25
    let v47: Double = v35[2]
    v13[1] = v34
    v6 = v13
    let v102: Double = v9[1]
    v5[1] = v102
    v5[1] = v12
    v13 = v5
    v13[1] = v22
    v5 = v35
    return v47
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]], p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])], p1: [s1(p0: [[s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]], p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])])])
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
