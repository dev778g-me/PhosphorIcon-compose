package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BoxingGloveDuotone: ImageVector
    get() {
        if (_BoxingGloveDuotone != null) {
            return _BoxingGloveDuotone!!
        }
        _BoxingGloveDuotone = ImageVector.Builder(
            name = "Duotone.BoxingGloveDuotone",
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
                moveTo(168f, 24f)
                horizontalLineTo(120f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 72f)
                verticalLineToRelative(8f)
                horizontalLineTo(56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                verticalLineToRelative(29.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, 5f)
                lineTo(72f, 176f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(176f)
                lineToRelative(15.69f, -54.92f)
                arcToRelative(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.31f, -2.2f)
                verticalLineTo(72f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 104f)
                verticalLineTo(72f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
                horizontalLineToRelative(48f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                verticalLineToRelative(46.88f)
                arcToRelative(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, 2.2f)
                lineTo(200f, 176f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(176f)
                lineTo(33.75f, 138.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, -5f)
                verticalLineTo(104f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 80f)
                horizontalLineTo(72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 160f)
                lineTo(168f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 160f)
                lineTo(104f, 192f)
            }
        }.build()

        return _BoxingGloveDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BoxingGloveDuotone: ImageVector? = null
