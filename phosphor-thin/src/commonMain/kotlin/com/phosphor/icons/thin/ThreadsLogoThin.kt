package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ThreadsLogoThin: ImageVector
    get() {
        if (_ThreadsLogoThin != null) {
            return _ThreadsLogoThin!!
        }
        _ThreadsLogoThin = ImageVector.Builder(
            name = "Thin.ThreadsLogoThin",
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
                moveTo(200f, 77.65f)
                curveTo(189.86f, 51.29f, 168.57f, 32f, 128f, 32f)
                curveToRelative(-64f, 0f, -80f, 48f, -80f, 96f)
                reflectiveCurveToRelative(16f, 96f, 80f, 96f)
                curveToRelative(48f, 0f, 72f, -32f, 72f, -56f)
                curveToRelative(0f, -64f, -104f, -64f, -104f, -16f)
                curveToRelative(0f, 40f, 72f, 40f, 72f, -24f)
                curveToRelative(0f, -56f, -56f, -56f, -72f, -32f)
            }
        }.build()

        return _ThreadsLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _ThreadsLogoThin: ImageVector? = null
