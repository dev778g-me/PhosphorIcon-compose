package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.FalloutShelterDuotone: ImageVector
    get() {
        if (_FalloutShelterDuotone != null) {
            return _FalloutShelterDuotone!!
        }
        _FalloutShelterDuotone = ImageVector.Builder(
            name = "Duotone.FalloutShelterDuotone",
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
                moveTo(128f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 96f, 96f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                close()
                moveTo(160f, 176f)
                lineTo(128f, 128f)
                lineTo(96f, 176f)
                lineTo(64f, 128f)
                horizontalLineToRelative(64f)
                lineTo(96f, 80f)
                horizontalLineToRelative(64f)
                lineToRelative(-32f, 48f)
                horizontalLineToRelative(64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 80f)
                lineToRelative(64f, 0f)
                lineToRelative(-32f, 48f)
                lineToRelative(-32f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                lineToRelative(64f, 0f)
                lineToRelative(-32f, 48f)
                lineToRelative(-32f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 128f)
                lineToRelative(64f, 0f)
                lineToRelative(-32f, 48f)
                lineToRelative(-32f, -48f)
                close()
            }
        }.build()

        return _FalloutShelterDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FalloutShelterDuotone: ImageVector? = null
