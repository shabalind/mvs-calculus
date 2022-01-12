  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [Double]
    var p6: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v7: Double = v1
    let v6: [[s0]] = v0.p0
    let v15: [s0] = v6[0]
    var v31: Double = v7
    let v13: [Double] = [v31, v1, v31, v1, v1]
    let v46: s0 = v15[0]
    let v55: [[Double]] = v46.p2
    let v53: [Double] = v55[0]
    let v52: Double = v13[0]
    let v74: Double = v13[4]
    let v149: Double = v53[0]
    let v116: Double = v53[0]
    var v109: Double = v52
    let v312: Double = v116 - v74
    v31 = v149
    let v347: Double = v109 - v312
    return v347
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0]], p3: [[6.0], [7.0]], p4: [[8.0], [9.0], [10.0]], p5: [11.0, 12.0, 13.0], p6: [[14.0], [15.0]])]], p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]], p2: [[20.0], [21.0]], p3: [[22.0], [23.0]], p4: [[24.0], [25.0], [26.0]], p5: [27.0, 28.0, 29.0], p6: [[30.0], [31.0]]))
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
