package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.HandHeartThin: ImageVector
    get() {
        if (_HandHeartThin != null) {
            return _HandHeartThin!!
        }
        _HandHeartThin = ImageVector.Builder(
            name = "Thin.HandHeartThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 208f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 160f)
                horizontalLineToRelative(32f)
                lineToRelative(67f, -15.41f)
                arcToRelative(16.61f, 16.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16f)
                horizontalLineToRelative(0f)
                arcToRelative(16.59f, 16.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.18f, 14.85f)
                lineTo(184f, 192f)
                lineToRelative(-64f, 16f)
                horizontalLineTo(48f)
                verticalLineTo(152f)
                lineToRelative(25f, -25f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, -7f)
                horizontalLineTo(140f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.73f, 120f)
                curveTo(87f, 107.72f, 80f, 94.56f, 80f, 80f)
                curveToRelative(0f, -21.69f, 17.67f, -40f, 39.46f, -40f)
                arcTo(39.12f, 39.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 64f)
                arcToRelative(39.12f, 39.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.54f, -24f)
                curveTo(214.33f, 40f, 232f, 58.31f, 232f, 80f)
                curveToRelative(0f, 29.23f, -28.18f, 55.07f, -50.22f, 71.32f)
            }
        }.build()

        return _HandHeartThin!!
    }

@Suppress("ObjectPropertyName")
private var _HandHeartThin: ImageVector? = null
