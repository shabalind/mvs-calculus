  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: Double, _ v1: s3) -> Double {
    let v7: [Double] = [v0, v0]
    let v2: Double = v7[1]
    var v3: [Double] = v7
    let v5: Double = v3[1]
    let v11: Double = v3[1]
    v3[1] = v11
    v3[0] = v5
    v3[1] = v11
    v3[0] = v11
    var v47: [Double] = v3
    v3 = v47
    v3[0] = v11
    v47[1] = v2
    let v137: Double = v47[1]
    return v137
  }
  func benchmark() {
    let v0: Double = 0.0
    let v1: s3 = s3(p0: s1(p0: [s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0], [5.0], [6.0]])], p1: s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0], [11.0], [12.0]])), p1: s1(p0: [s0(p0: [[13.0], [14.0], [15.0]], p1: [[16.0], [17.0], [18.0]])], p1: s0(p0: [[19.0], [20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])))
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[1.0], [2.0], [3.0]], [[4.0], [5.0], [6.0]]])], StructValue(Name(str='s0', ty=None), [[[7.0], [8.0], [9.0]], [[10.0], [11.0], [12.0]]])]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[13.0], [14.0], [15.0]], [[16.0], [17.0], [18.0]]])], StructValue(Name(str='s0', ty=None), [[[19.0], [20.0], [21.0]], [[22.0], [23.0], [24.0]]])])])
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
