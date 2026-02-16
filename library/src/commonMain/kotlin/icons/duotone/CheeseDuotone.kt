package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CheeseDuotone: ImageVector
    get() {
        if (_CheeseDuotone != null) {
            return _CheeseDuotone!!
        }
        _CheeseDuotone = ImageVector.Builder(
            name = "Duotone.CheeseDuotone",
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
                moveTo(184f, 40f)
                lineTo(24f, 88f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(8f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 23.54f)
                curveTo(56.25f, 149f, 44.91f, 160f, 31.46f, 160f)
                lineTo(24f, 160f)
                verticalLineToRelative(32f)
                lineTo(80f, 192f)
                verticalLineToRelative(-8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(232f, 88f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 40f)
                close()
                moveTo(168f, 136f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -27.72f, -48f)
                horizontalLineToRelative(55.44f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 160f)
                horizontalLineToRelative(7.46f)
                curveToRelative(13.45f, 0f, 24.79f, -11f, 24.54f, -24.46f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 112f)
                horizontalLineTo(24f)
                verticalLineTo(88f)
                horizontalLineTo(232f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 88f)
                lineTo(184f, 40f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 192f)
                verticalLineToRelative(-8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(195.72f, 88f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -55.44f, 0f)
            }
        }.build()

        return _CheeseDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CheeseDuotone: ImageVector? = null
