package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.MoneyDuotone: ImageVector
    get() {
        if (_MoneyDuotone != null) {
            return _MoneyDuotone!!
        }
        _MoneyDuotone = ImageVector.Builder(
            name = "Duotone.MoneyDuotone",
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
                moveTo(128f, 128f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(240f, 64f)
                horizontalLineTo(200f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(240f, 192f)
                verticalLineTo(152f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 40f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(16f, 192f)
                verticalLineTo(152f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(16f, 64f)
                verticalLineToRelative(40f)
                arcTo(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 64f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-224f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 104f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 192f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 152f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 64f)
                arcToRelative(48.85f, 48.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, 40f)
            }
        }.build()

        return _MoneyDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyDuotone: ImageVector? = null
