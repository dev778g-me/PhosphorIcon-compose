package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.RabbitDuotone: ImageVector
    get() {
        if (_RabbitDuotone != null) {
            return _RabbitDuotone!!
        }
        _RabbitDuotone = ImageVector.Builder(
            name = "Duotone.RabbitDuotone",
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
                moveTo(191.71f, 153.82f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 213.3f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -63.71f, -59.48f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.42f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 164f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 164f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 200f)
                lineToRelative(-16f, 13.31f)
                lineToRelative(-16f, -13.31f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(146.56f, 98.73f)
                curveTo(152.16f, 72.39f, 167f, 16f, 190.94f, 16f)
                curveToRelative(28.22f, 0f, 18.27f, 65.06f, -6.91f, 113f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.44f, 98.73f)
                curveTo(103.84f, 72.39f, 89f, 16f, 65.06f, 16f)
                curveTo(36.84f, 16f, 46.79f, 81.06f, 72f, 129f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(191.71f, 153.82f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 213.3f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -63.71f, -59.48f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.42f, 0f)
                close()
            }
        }.build()

        return _RabbitDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RabbitDuotone: ImageVector? = null
