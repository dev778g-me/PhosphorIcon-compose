package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.StarOfDavidThin: ImageVector
    get() {
        if (_StarOfDavidThin != null) {
            return _StarOfDavidThin!!
        }
        _StarOfDavidThin = ImageVector.Builder(
            name = "Thin.StarOfDavidThin",
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
                moveTo(128f, 240f)
                lineToRelative(96f, -168f)
                lineToRelative(-192f, 0.04f)
                lineToRelative(96f, 167.96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 16f)
                lineToRelative(96f, 168f)
                lineToRelative(-192f, -0.04f)
                lineToRelative(96f, -167.96f)
                close()
            }
        }.build()

        return _StarOfDavidThin!!
    }

@Suppress("ObjectPropertyName")
private var _StarOfDavidThin: ImageVector? = null
