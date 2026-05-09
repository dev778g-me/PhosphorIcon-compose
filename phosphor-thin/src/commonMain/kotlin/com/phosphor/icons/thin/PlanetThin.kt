package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.PlanetThin: ImageVector
    get() {
        if (_PlanetThin != null) {
            return _PlanetThin!!
        }
        _PlanetThin = ImageVector.Builder(
            name = "Thin.PlanetThin",
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
                moveTo(128f, 128f)
                moveToRelative(-88f, 0f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184.76f, 60.75f)
                curveToRelative(27.13f, -7.21f, 47.41f, -6.45f, 53.44f, 3.94f)
                curveToRelative(11f, 18.93f, -29.45f, 62.61f, -90.32f, 97.58f)
                reflectiveCurveToRelative(-119.1f, 48f, -130.08f, 29f)
                curveToRelative(-6.05f, -10.43f, 3.51f, -28.37f, 23.49f, -48.23f)
            }
        }.build()

        return _PlanetThin!!
    }

@Suppress("ObjectPropertyName")
private var _PlanetThin: ImageVector? = null
