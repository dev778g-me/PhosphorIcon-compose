package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TipiThin: ImageVector
    get() {
        if (_TipiThin != null) {
            return _TipiThin!!
        }
        _TipiThin = ImageVector.Builder(
            name = "Thin.TipiThin",
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
                moveTo(104f, 16f)
                lineToRelative(128f, 200f)
                lineToRelative(-208f, 0f)
                lineToRelative(128f, -200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.68f, 216f)
                lineToRelative(56.32f, -88f)
                lineToRelative(56.32f, 88f)
            }
        }.build()

        return _TipiThin!!
    }

@Suppress("ObjectPropertyName")
private var _TipiThin: ImageVector? = null
