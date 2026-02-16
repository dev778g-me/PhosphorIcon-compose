package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ShuffleDuotone: ImageVector
    get() {
        if (_ShuffleDuotone != null) {
            return _ShuffleDuotone!!
        }
        _ShuffleDuotone = ImageVector.Builder(
            name = "Duotone.ShuffleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(32f, 184f)
                horizontalLineTo(55.06f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52.08f, -26.8f)
                lineToRelative(41.72f, -58.4f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.94f, 72f)
                horizontalLineTo(232f)
                verticalLineTo(184f)
                horizontalLineTo(200.94f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52.08f, -26.8f)
                lineTo(107.14f, 98.8f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.06f, 72f)
                horizontalLineTo(32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 72f)
                horizontalLineTo(55.06f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.08f, 26.8f)
                lineToRelative(41.72f, 58.4f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.94f, 184f)
                horizontalLineTo(232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 48f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 160f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.66f, 100.47f)
                lineToRelative(1.2f, -1.67f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.94f, 72f)
                horizontalLineTo(232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 184f)
                horizontalLineTo(55.06f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52.08f, -26.8f)
                lineToRelative(1.2f, -1.67f)
            }
        }.build()

        return _ShuffleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleDuotone: ImageVector? = null
