package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.FlowerLight: ImageVector
    get() {
        if (_FlowerLight != null) {
            return _FlowerLight!!
        }
        _FlowerLight = ImageVector.Builder(
            name = "Light.FlowerLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(111.71f, 100.45f)
                curveTo(103.81f, 85.56f, 96f, 67.85f, 96f, 56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                curveToRelative(0f, 11.85f, -7.81f, 29.56f, -15.71f, 44.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 128.33f)
                curveToRelative(-16.85f, -0.6f, -36.09f, -2.69f, -46.35f, -8.62f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -55.42f)
                curveToRelative(10.26f, 5.92f, 21.7f, 21.54f, 30.64f, 35.83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.29f, 155.88f)
                curveToRelative(-8.94f, 14.29f, -20.38f, 29.91f, -30.64f, 35.83f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, -55.42f)
                curveToRelative(10.26f, -5.93f, 29.5f, -8f, 46.35f, -8.62f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144.29f, 155.55f)
                curveTo(152.19f, 170.44f, 160f, 188.15f, 160f, 200f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                curveToRelative(0f, -11.85f, 7.81f, -29.56f, 15.71f, -44.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 127.67f)
                curveToRelative(16.85f, 0.6f, 36.09f, 2.69f, 46.35f, 8.62f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 55.42f)
                curveToRelative(-10.26f, -5.92f, -21.7f, -21.54f, -30.64f, -35.83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(143.71f, 100.12f)
                curveToRelative(8.94f, -14.29f, 20.38f, -29.91f, 30.64f, -35.83f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 55.42f)
                curveToRelative(-10.26f, 5.93f, -29.5f, 8f, -46.35f, 8.62f)
            }
        }.build()

        return _FlowerLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerLight: ImageVector? = null
